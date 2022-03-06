# gitbucket-code-search-plugin

# Features

This plugin provides link to GitBucket default code(file) search page on repositorie's sidebar menu.

# Images

![menu](./doc/images/image.png)

# Download & Installation

1. Download plugin jar file from [the release page](//github.com/yoshinorin/gitbucket-code-search-plugin/releases).
2. Put plugin jar file into `GITBUCKET_HOME/plugins` and restart GitBucket.

# UI Usage

Goto the `repository` menu, you can see `Code search` section.

# Compatibility with GitBucket

|Plugin version|GitBucket version|
|:-------------:|:-------:|
|2.0.0|4.32.0 - 4.34.0|
|1.0.0|4.19.x - 4.31.x|

# Build from source

```sh
sbt assembly
```

The built package will be created at `/target/scala-2.13/gitbucket-code-search-plugin-{plugin-version}.jar`

# License

This project is under the Apache License, Version 2.0 License. See the [LICENSE](./LICENSE) file for the full license text.
