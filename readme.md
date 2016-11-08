# springboot-and-angular2

A fully integrated project setup with Angular2, Spring Boot and e2e tests controlled by Maven build.

## Prerequisites

> Install angular cli

`npm install -g angular-cli`


## Quick start

> Clone/Download the repo

```bash
# clone this repo
$ git clone https://github.com/cybermario/springboot-and-angular2.git springboot-and-angular2

# change directory to demo-backend-ui
$ cd demo-backend-ui

# install the dependencies with npm
$ npm install

# start the server
$ ng serve
```
go to [http://localhost:4200](http://localhost:4200) in your browser.


## Maven Build

To build the whole project change to root directory and then do

`mvn install`


## Architecture

This demo project contains 3 Maven modules.

The `demo-backend-ui` module contains an AngularJS 2 app managed by Angular Cli.
Maven bundles the Angular app by means of the `maven-assembly-plugin` into the resulting jar file.
The location within the .jar is `/static`.

By using the `maven-dependency-plugin` the module `demo-backend` unpacks the `/static` folder of the
`demo-backend-ui` module, which in turn is used by `spring-boot-starter-web` as its static resource directory.

At least we have the `demo-client` module which currently is there only for demo purpose.







