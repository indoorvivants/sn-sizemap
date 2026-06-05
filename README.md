# Break down the size of a Scala Native binary


**Installation**: download the binary for your system from [Releases](https://github.com/indoorvivants/sn-sizer/releases/latest)

```
$ sn-sizer serve test-binary
Starting server on http://localhost:52616
```

When you navigate to the page, you will be greeted with an interactive dashboard allowing to drill down into the various packages and their sizes.

<img width="2212" height="1226" alt="CleanShot 2026-06-05 at 12 53 22@2x" src="https://github.com/user-attachments/assets/6c1f32b2-5a14-4209-8b1e-ec0d015b8cf4" />


At the moment, only MacOS and Linux  binaries are supported, to support Windows we need a brave volunteer.

<!--toc:start-->
- [Break down the size of a Scala Native binary](#break-down-the-size-of-a-scala-native-binary)
  - [Contributing](#contributing)
    - [Building CLI](#building-cli)
    - [Working on frontend](#working-on-frontend)
    - [Working on CLI/backend](#working-on-clibackend)
<!--toc:end-->

## Contributing

This is an sbt project with two modules:

- `cli` - a Scala Native CLI that analyses the binary and starts and embedded HTTP server which serves a web frontend to explore the binary.

- `frontend` - a Scala.js single-page application, using Vite as bundler and dev server

### Building CLI 

The frontend and the backend need to be built in strict order. 

Run `frontendBuild; buildBinaryDebug` and `./out/debug/sn-sizemap` binary will be produced with latest version of the frontend embedded in the CLI itself.

If you want to build a release version, run `frontendBuild; buildBinaryRelease`.

For convenience, these commands are provided:

- `debugBuild`
- `releaseBuild`
- `debugPlatformBuild`
- `releasePlatformBuild`

The project is structured to allow working on frontend and CLI independently.

### Working on frontend 

1. First, start the CLI server – for simplicity, we provide a `serveItself` sbt task - it will launch the server on port 8899 analysing the CLI's binary itself
2. Then, run `frontend/reStart` - this will start Vite's dev server, connecting to the backend on port 8899
3. Run `~fastLinkJS` to automatically rebuild the Scala.js frontend on each change 

To produce an optimised bundle, run `frontendBuild` - it will place the fully static bundle in `frontend/dist` folder.

### Working on CLI/backend

`serveItself` task will automatically rebuild the CLI and restart the server every 
time you run it.

Alternatively, run `cli/reStart <args>` to launch it with different parameters.
