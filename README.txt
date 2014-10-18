Welcome to the Spritz SDK for Android release 1.1.

------------------------------------------------------------------------------------------
Prerequisites:

- Java SDK
    - Java SDK version 1.6 or higher

- Android SDK
	- Android SDK Build Tools Rev 19.1.0
	- Android API 14 (Android 4.0.0): Target SDK 14, min SDK is 14 (Android 4.0)

- Android Studio
	Although builds can be accomplished without an IDE, this distribution does include
	an Android Studio project file.
	
- Access to the internet
	The Spritz SDK components reside in a publicly accessible Maven Repository.  In 
	addition, the SDK utilizes additional dependences available in the MavenCentral
	repository.

------------------------------------------------------------------------------------------	
Architecture:

The Spritz Android SDK is distributed as an AAR-packaged Android Library and made 
available through the Spritz Maven repository.  The AAR depends on additional 
Spritz-supplied components, as well as some additional open-source projects.  

The SDK contains high-level components that should make it easy to integrate Spritzing
into an application.  It's also possible to use the lower level components to 
achieve a higher level of customization, however most lower level components are not
documented, and their APIs may change in future releases.

------------------------------------------------------------------------------------------
Repository Setup:

To access the Spritz Maven repository, a project needs the following entries added to the
repository definition block of the gradle script.

repositories {
    mavenCentral()
    maven {
        url "https://nexus.spritzinc.com/content/repositories/PublicReleases"
    }
}

------------------------------------------------------------------------------------------
Building the samples:

Using Android Studio

1. Start Android Studio
2. From the application menu, choose "File -> Import Project" and select the samples
   folder.  It's important to choose "Import" rather than "Open".
3. Open the "Application" class contained in 
   HelloWorld/src/main/java/com/spritzinc/android/sdk/sample/helloworld/Application.java
   and enter your Client ID and Client Secret, which you should have received after
   developer registration.  You can also retrieve the ID and secret from this url:
   https://api.spritzinc.com/api-server/register/complete (login required)
4. From the application menu, choose "Build -> Make"

From the command line:

Create a local.properties to tell the Gradle Android plugin where to find your Android SDK
installation:

1. Create a new text file, samples/local.properties
2. In the new file add the following line, plugging in your actual SDK install path:
sdk.dir=<PATH TO YOU ANDROID SDK>
3.  Save the file.

Plug in your client ID and client secret into Spritz SDK initialization block in 
samples/HelloWorld/src/main/java/com/spritzinc/android/sdk/sample/helloworld/
Application.java

From a command line execute:

1.  Change directory to samples.
2.  Execute the following: 
	*NIX: ./gradlew assembleDebug
	Windows gradlew.bat assembleDebug
	
Gradle will download the necessary dependencies and build the sample "HelloWorld" 
application.

------------------------------------------------------------------------------------------
Running the samples:

To run a sample application from the command line:

1.  Start an emulator, or connect your Android phone
2.  Open a command prompt and change directory to samples/HelloWorld
3.  Execute the following:
	*NIX: ../gradlew installDebug
	Windows ..\gradlew.bat assembleDebug
4.  Start the application (Hello World) on the emulator or phone

To run a sample application from Android Studio:

1.  Select the desired application target from the the "Configurations" drop down.
2.  Click the "Run" or "Debug" icon.

------------------------------------------------------------------------------------------
Documentation:

Documentation is available online at the following URL:

https://spritzinc.atlassian.net/wiki/display/andsdk/Android+SDK+Documentation

------------------------------------------------------------------------------------------
Gradle:

The sample project uses the Gradle Wrapper to tightly control the Gradle version used for
builds.   Currently there appears to be a bug in Gradle 1.12 that causes transitive 
dependencies between AAR files to fail when downloading artifacts.  The Gradle Wrapper 
included in the ZIP file is set to use version 1.11.  The sample projects have been tested
with this version.
