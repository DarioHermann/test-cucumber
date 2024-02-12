# test-cucumber


## How to install

Use your favourite IDE, but I recommend VScode

#### What you might need to download the project:

 - Git

#### What you'll need for any IDE:
 - Download Java (recommend java 17) (and add it to the environment variables as a JAVA_HOME path, don't forget to restart after setting it up)


### Using VSCode (Recommended)

#### What you'll need:

 - Gradle (File -> Preferences -> Extensions: "Gradle for Java")
 - Cucumber (File -> Preferences -> Extensions: "Cucumber")

#### Recommended:

 - Extension Pack for Java (File -> Preferences -> Extensions: "Extension Pack for Java")
 - Gherkin indent (File -> Preferences -> Extensions: "Gherkin indent")

#### Getting import errors?

If you get import errors, try F1 -> "Java: Clean the Java Language Server Workspace" -> Restart and Delete


### Using IntelliJ

#### What you'll need:

 - Gradle (Preferences -> Plugins: "Gradle")
 - Gradle Extension (Preferences -> Plugins: "Gradle Extension")
 - Gherkin (Preferences -> Plugins: "Gherkin")
 - Cucumber for Java(Preferences -> Plugins: "Cucumber for Java")

#### Getting import errors?

If you get import errors, try File -> Invalidate Caches -> check: "Clear file system cache and Local History", "Clear VCS Log caches and indexes" and "Mark downloaded shared indexes as excluded" and press "Invalidate and Restart"

### Using Eclipse (not recommended)

This IDE is not recommended as it can't find and run custom gradle tasks.
To run the cucumber tests with this IDE you'll have to open an extra terminal

#### What you'll need:

 - Cucumber Eclipse Plugin (Help -> Eclipse Marketplace...: "Cucumber Eclipse Plugin)



## How to run:

### VSCode & IntelliJ:

#### Using the Gradle console:

 - Make sure to load the gradle project first, but after its loaded, you should see the gradle console (it's a tab with an elephant, on VSCode it's usually on the left, on IntelliJ it's usually on the top right)

 - gradle console -> test-cucumber -> Tasks -> other -> acceptanceTest

 - The test should fail (with 2 steps passing and 1 failing), if this doesn't happen, check for errors and try to debug it. If you need any help, contact us.

 #### Using the terminal:

 - IntelliJ should have a terminal option on the bottom right, for VSCode do Terminal -> New Terminal

 - Run the command: '''./gradlew acceptanceTest'''

 - The test should fail (with 2 steps passing and 1 failing), if this doesn't heppen, check for errors and try to debug it. If you need any help, contact us.

### Eclipse (it also works for VSCode and IntelliJ)

 - Go to the projects folder (should be the folder called "test-cucumber")

 - Run the command: '''./gradlew acceptanceTest'''

 - The test should fail (with 2 steps passing and 1 failing), if this doesn't heppen, check for errors and try to debug it. If you need any help, contact us.


### NOTE:
When running through the terminal, if you're using mac's terminal or powershell, use '''./gradlew''' to run the gradle command, if using cmd, simply use '''gradlew'''

Feel free to try and make the test pass :) 