# I'm just a simple farmer
I have no idea what I'm doing.

Acute Loot is cool and adds some fun flavor to Minecraft, making it seem more like an RPG.

It does mess up big atuomation-farms though, so I wanted to make a special hopper that simply strips the added flavor so that the items can be sortable and stacked like normal.

Works like a normal hopper, but strips Acute Loot (like runnning /acuteloot remove)

![Recipe for Remove Acute Loot Hopper](recipe.png "Recipe for Remove Acute Loot Hopper").



This has been made to work with Bukkit (papermc \ spigot \ ?)

## Installation
Newest release will be compiled to the `plugins\SimpleFarmerPlugin\target` folder.

Copy the jar file to your plugin folder.

### Don't trust the internet? Compile it yourself
There's really not much going on in the source code, so feel free to check it out for yourself and compile your own version. Change it. Tell everyone you made it. Who cares ¯\_(ツ)_/¯

You just need to download Java and Apache's Maven and run a few commands.

#### Java JDK
1. Download the latest version of Java JDK from the official website: https://www.oracle.com/java/technologies/downloads/
2. Install it

#### Apache Maven
1. Download the latest version of Maven from the official website: https://maven.apache.org/download.cgi
2. Extract it to `C:\Program Files\Apache\maven` (for example)
3. Add the Maven `bin` directory to your system's `PATH` environment variable
    - In command line, type the following command: `set PATH=C:\Program Files\Apache\maven\bin;%PATH%`
    - Verify that the path was added to the list of other path's by running `echo %PATH%`
4. You also need to set the environment variable `JAVA_HOME`
    - In command line, type the following command: `set JAVA_HOME=C:\Program Files\Apache\maven\bin;`
    - Verify that the path was added to the list of other path's by running `echo %JAVA_HOME%`
5. Close your command line, because it needs to be reloaded for the PATH's to be updated.

*(If you set the paths as admin, it will be set for all users, which is what I do.)*

#### Compile time!
1. Download my code.
2. In command line go to my plugin folder, for example `cd plugins\SimpleFarmerPlugin`
3. run command `mvn package`
4. Your compiled plugin should be in the target folder

Example:
```
PS C:\source\github\mrkesu\minecraft> cd plugins\SimpleFarmerPlugin
PS C:\source\github\mrkesu\minecraft\plugins\SimpleFarmerPlugin> mvn package
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.mrkesu.minecraft:KrakenSimpleFarmer:jar:1.0.1
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 30, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] --------------< com.mrkesu.minecraft:KrakenSimpleFarmer >---------------
[INFO] Building Kraken Simple Farmer Plugin 1.0.1
[INFO] Compiling 4 source files to C:\source\github\mrkesu\minecraft\plugins\SimpleFarmerPlugin\target\classes
[INFO]
[INFO] --- resources:3.3.0:testResources (default-testResources) @ KrakenSimpleFarmer ---
[INFO] skip non existing resourceDirectory C:\source\github\mrkesu\minecraft\plugins\SimpleFarmerPlugin\src\test\resources
[INFO]
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ KrakenSimpleFarmer ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.0.0:test (default-test) @ KrakenSimpleFarmer ---
[INFO] No tests to run.
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ KrakenSimpleFarmer ---
[INFO] Building jar: C:\source\github\mrkesu\minecraft\plugins\SimpleFarmerPlugin\target\KrakenSimpleFarmer-1.0.1.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.963 s
[INFO] Finished at: 2023-03-20T07:32:38+01:00
[INFO] ------------------------------------------------------------------------
PS C:\source\github\mrkesu\minecraft\plugins\SimpleFarmerPlugin>
```