#include "httplib_glue.h"
#include "httplib.hpp"
#include <string>

void prepare(httplib::Response &res, Resp *resp) {
  res.status = resp->code;
  switch (resp->bodyType) {
  case JAVASCRIPT:
    res.set_content(static_cast<char *>(resp->body), "application/javascript");
    break;
  case HTML:
    res.set_content(static_cast<char *>(resp->body), "text/html");
    break;
  default:
    break;
  }
}

void start_server(Handlers *handlers, const char *socket, int port) {
  httplib::Server server;

  server.Get("/raw.js", [&](const httplib::Request &req, httplib::Response &res) {
    auto resp = handlers->data();

    prepare(res, resp);
  });

  server.Get("/index.html", [&](const httplib::Request &req, httplib::Response &res) {
    auto resp = handlers->index();

    prepare(res, resp);
  });

  server.Get("/", [&](const httplib::Request &req, httplib::Response &res) {
    auto resp = handlers->index();

    prepare(res, resp);
  });



  if(port == 0) {
      auto boundPort = server.bind_to_any_port(socket, port);
      std::cout << "Starting server on http://" << socket << ":" << boundPort << std::endl;
      server.listen_after_bind();
  } else {
      std::cout << "Starting server on http://" << socket << ":" << port << std::endl;
      server.listen(socket, port);
  }
}
