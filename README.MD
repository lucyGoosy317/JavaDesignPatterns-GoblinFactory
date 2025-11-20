#  Goblin Factory

Just a fun project to explore more into the world of oop design patterns

To make it more fun, they will be based on video games. Such as this one

we always need to create units in RTS games, most times there is some 

type object(building), like a barracks that produces units that are close

to similar, but have different jobs.
<br><br>

### Overview: How it works
#
GoblinFactory - instantiates the concrete classes, based on condition. Consider this like our barracks.

Goblin - abstract class consisting of factory methods(non abstract and abstract) extended by concrete classes, to get a GoblinType object. ie GoblinWarrior


GoblinWarrior, GoblinArcher, and GoblinMage a the concrete classes that
implement the Goblin interface and are produce from the GoblinFactory. These are like our options presented from the barracks.


Note If used with interface: 

The Goblin class can also be an interface class
(interface)Goblin - interface consisting of factory methods implemented by concrete classes, to get a GoblinType object. ie GoblinWarrior

(Formally Goblin abstract)GoblinCommon - A concrete class that is the parent class of Goblin types, it contains the shared attributes of Goblin which is extended by the goblin types.



## How to build
Java 17 (different versions of java will require different version of gradle support and change of plugins)
Gradle 8.1.1

Built with gradle wrapper:

linux

$ ./gradlew clean build

windows

./gradlew.bat clean build

Run with:

linux

$ ./gradlew run

windows
./gradlew.bat run