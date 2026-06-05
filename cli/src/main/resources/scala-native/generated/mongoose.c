// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

#include <string.h>
#include "../mongoose.h"

_Bool __sn_wrap_mongoose_mg_aton(struct mg_str *str, struct mg_addr * addr) {
 return mg_aton(*str, addr);
};


int __sn_wrap_mongoose_mg_check_ip_acl(struct mg_str *acl, struct mg_addr * remote_ip) {
 return mg_check_ip_acl(*acl, remote_ip);
};


void __sn_wrap_mongoose_mg_dash_file_add(struct mg_str *name, size_t size) {
 mg_dash_file_add(*name, size);
};


void __sn_wrap_mongoose_mg_dash_file_del(struct mg_str *name) {
 mg_dash_file_del(*name);
};


void __sn_wrap_mongoose_mg_file_read(struct mg_fs * fs, const char * path, struct mg_str *____return) {
  struct mg_str ____ret = mg_file_read(fs, path);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


void __sn_wrap_mongoose_mg_http_get_header_var(struct mg_str *s, struct mg_str *v, struct mg_str *____return) {
  struct mg_str ____ret = mg_http_get_header_var(*s, *v);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


size_t __sn_wrap_mongoose_mg_http_next_multipart(struct mg_str *_0, size_t _1, struct mg_http_part * _2) {
 return mg_http_next_multipart(*_0, _1, _2);
};


// void __sn_wrap_mongoose_mg_http_start_upload(struct mg_connection * c, struct mg_http_message * hm, struct mg_str *name, struct mg_str *dir, struct mg_fs * fs, void (*)(struct mg_connection *, const char *) fn) {
//  mg_http_start_upload(c, hm, *name, *dir, fs, fn);
// };


void __sn_wrap_mongoose_mg_http_var(struct mg_str *buf, struct mg_str *name, struct mg_str *____return) {
  struct mg_str ____ret = mg_http_var(*buf, *name);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


int __sn_wrap_mongoose_mg_json_get(struct mg_str *json, const char * path, int * toklen) {
 return mg_json_get(*json, path, toklen);
};


char * __sn_wrap_mongoose_mg_json_get_b64(struct mg_str *json, const char * path, int * len) {
 return mg_json_get_b64(*json, path, len);
};


_Bool __sn_wrap_mongoose_mg_json_get_bool(struct mg_str *json, const char * path, _Bool * v) {
 return mg_json_get_bool(*json, path, v);
};


char * __sn_wrap_mongoose_mg_json_get_hex(struct mg_str *json, const char * path, int * len) {
 return mg_json_get_hex(*json, path, len);
};


long __sn_wrap_mongoose_mg_json_get_long(struct mg_str *json, const char * path, long dflt) {
 return mg_json_get_long(*json, path, dflt);
};


_Bool __sn_wrap_mongoose_mg_json_get_num(struct mg_str *json, const char * path, double * v) {
 return mg_json_get_num(*json, path, v);
};


char * __sn_wrap_mongoose_mg_json_get_str(struct mg_str *json, const char * path) {
 return mg_json_get_str(*json, path);
};


void __sn_wrap_mongoose_mg_json_get_tok(struct mg_str *json, const char * path, struct mg_str *____return) {
  struct mg_str ____ret = mg_json_get_tok(*json, path);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


size_t __sn_wrap_mongoose_mg_json_next(struct mg_str *obj, size_t ofs, struct mg_str * key, struct mg_str * val) {
 return mg_json_next(*obj, ofs, key, val);
};


size_t __sn_wrap_mongoose_mg_json_unescape(struct mg_str *json, const char * path, char * _2, size_t _3) {
 return mg_json_unescape(*json, path, _2, _3);
};


_Bool __sn_wrap_mongoose_mg_match(struct mg_str *str, struct mg_str *pattern, struct mg_str * caps) {
 return mg_match(*str, *pattern, caps);
};


_Bool __sn_wrap_mongoose_mg_path_is_sane(const struct mg_str *path) {
 return mg_path_is_sane(*path);
};


// void __sn_wrap_mongoose_mg_rpc_add(struct mg_rpc ** head, struct mg_str *method_pattern, void (*)(struct mg_rpc_req *) handler, void * handler_data) {
//  mg_rpc_add(head, *method_pattern, handler, handler_data);
// };


_Bool __sn_wrap_mongoose_mg_span(struct mg_str *s, struct mg_str * a, struct mg_str * b, char delim) {
 return mg_span(*s, a, b, delim);
};


void __sn_wrap_mongoose_mg_str_n(const char * s, size_t n, struct mg_str *____return) {
  struct mg_str ____ret = mg_str_n(s, n);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


void __sn_wrap_mongoose_mg_str_s(const char * s, struct mg_str *____return) {
  struct mg_str ____ret = mg_str_s(s);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


_Bool __sn_wrap_mongoose_mg_str_to_num(struct mg_str *_0, int base, void * val, size_t val_len) {
 return mg_str_to_num(*_0, base, val, val_len);
};


int __sn_wrap_mongoose_mg_strcasecmp(const struct mg_str *str1, const struct mg_str *str2) {
 return mg_strcasecmp(*str1, *str2);
};


int __sn_wrap_mongoose_mg_strcmp(const struct mg_str *str1, const struct mg_str *str2) {
 return mg_strcmp(*str1, *str2);
};


void __sn_wrap_mongoose_mg_strdup(const struct mg_str *s, struct mg_str *____return) {
  struct mg_str ____ret = mg_strdup(*s);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


void __sn_wrap_mongoose_mg_unpacked(const char * path, struct mg_str *____return) {
  struct mg_str ____ret = mg_unpacked(path);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


void __sn_wrap_mongoose_mg_url_host(const char * url, struct mg_str *____return) {
  struct mg_str ____ret = mg_url_host(url);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


void __sn_wrap_mongoose_mg_url_pass(const char * url, struct mg_str *____return) {
  struct mg_str ____ret = mg_url_pass(url);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}


void __sn_wrap_mongoose_mg_url_user(const char * url, struct mg_str *____return) {
  struct mg_str ____ret = mg_url_user(url);
  memcpy(____return, &____ret, sizeof(struct mg_str));
}
