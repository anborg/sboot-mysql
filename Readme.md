## sboot mariadb

#### To test with podman-compose
Prerequisites: 
1. podman & podmancompsoe are installed and working
2. loggin credentials of image registries.

#### Build the app image
```shell
git clone <this repo>
cd sboot-mysql
./2_devimgbuild.sh
```
#### Run db & app using podman-compose
```shell
cd podman-compose
./start.sh
#In another terminal execute stop.sh.
```
#### Test the application
```shell
curl http://localhost:8080/quotes
[ {
  "id" : 1,
  "quote" : "There are only two kinds of languages: the ones people complain about and the ones nobody uses.",
  "author" : "Bjarne Stroustrup"
}, {
  "id" : 3,
  "quote" : "Any fool can write code that a computer can understand. Good programmers write code that humans can understand.",
  "author" : "Martin Fowler"
}, {
  "id" : 4,
  "quote" : "First, solve the problem. Then, write the code.",
  "author" : "John Johnson"
}, {
  "id" : 5,
  "quote" : "Java is to JavaScript what car is to Carpet.",
  "author" : "Chris Heilmann"
}, {
  "id" : 6,
  "quote" : "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.",
  "author" : "John Woods"
}, {
  "id" : 7,
  "quote" : "I'm not a great programmer; I'm just a good programmer with great habits.",
  "author" : "Kent Beck"
}, {
  "id" : 8,
  "quote" : "Truth can only be found in one place: the code.",
  "author" : "Robert C. Martin"
}, {
  "id" : 9,
  "quote" : "If you have to spend effort looking at a fragment of code and figuring out what it's doing, then you should extract it into a function and name the function after the \"what\".",
  "author" : "Martin Fowler"
}, {
  "id" : 10,
  "quote" : "The real problem is that programmers have spent far too much time worrying about efficiency in the wrong places and at the wrong times; premature optimization is the root of all evil (or at least most of it) in programming.",
  "author" : "Donald Knuth"
}, {
  "id" : 11,
  "quote" : "SQL, Lisp, and Haskell are the only programming languages that I’ve seen where one spends more time thinking than typing.",
  "author" : "Philip Greenspun"
}, {
  "id" : 12,
  "quote" : "Deleted code is debugged code.",
  "author" : "Jeff Sickel"
}, {
  "id" : 13,
  "quote" : "There are two ways of constructing a software design: One way is to make it so simple that there are obviously no deficiencies and the other way is to make it so complicated that there are no obvious deficiencies.",
  "author" : "C.A.R. Hoare"
}, {
  "id" : 14,
  "quote" : "Simplicity is prerequisite for reliability.",
  "author" : "Edsger W. Dijkstra"
}, {
  "id" : 15,
  "quote" : "There are only two hard things in Computer Science: cache invalidation and naming things.",
  "author" : "Phil Karltonn"
}, {
  "id" : 16,
  "quote" : "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
  "author" : "Bill Gates"
} ]% 
```
