# gitbucket-code-search-plugin

# Features

This plugin provides link to GitBucket default code(file) search page on repositorie's sidebar menu.

# Images

![menu](./doc/images/image.png)

# Download & Installation

1. Download plugin jar file from [the release page](//github.com/YoshinoriN/gitbucket-code-search-plugin/releases).
2. Put plugin jar file into `GITBUCKET_HOME/plugins` and restart GitBucket.

# UI Usage

Goto the `repository` menu, you can see `Code search` section.

# Compatibility with GitBucket

|Plugin version|GitBucket version|
|:-------------:|:-------:|
|1.0.0|4.19.x - 4.21.x|

# Build from source

```sh
sbt package
```

The built package will be created at `/target/scala-2.12/gitbucket-code-search-plugin_2.12-{plugin-version}.jar`

# License

This project is under the Apache License, Version 2.0 License. See the [LICENSE](./LICENSE) file for the full license text.
