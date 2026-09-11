\---------------------------------------------------------------

**Part 1: Setup Eclipse \& Create Project**



**Step 1:** Open Eclipse Enterprise Edition



**Step 2:** Create a New Dynamic Web Project

**File → New → Dynamic Web Project**

Project name: User\_management

Target runtime: Apache Tomcat v10.1

If not available, click New and add Tomcat 10.1 installation path

Click Next → Finish



**Step 3:** Convert to Maven Project

**Right-click on project → Configure → Convert to Maven Project**

Group ID: org.example

Artifact ID: User\_management

Version: 1.0-SNAPSHOT

Packaging: war

Click Finish



\---------------------------------------------------------------

**Part 2: Add Dependencies to pom.xml**

Step 1: Open pom.xml



**Right-click project → pom.xml → Open**



**Step 2:** Replace pom.xml with this content

<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0"

     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 

         http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>



    <groupId>org.example</groupId>

    <artifactId>User\_management</artifactId>

    <version>1.0-SNAPSHOT</version>

    <packaging>war</packaging>



    <properties>

        <maven.compiler.source>19</maven.compiler.source>

        <maven.compiler.target>19</maven.compiler.target>

        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

    </properties>



    <dependencies>

        <!-- Jakarta Servlet API -->

        <dependency>

            <groupId>jakarta.servlet</groupId>

            <artifactId>jakarta.servlet-api</artifactId>

            <version>6.0.0</version>

            <scope>provided</scope>

        </dependency>



        <!-- Gson for JSON -->

        <dependency>

            <groupId>com.google.code.gson</groupId>

            <artifactId>gson</artifactId>

            <version>2.10.1</version>

        </dependency>



        <!-- MySQL Connector -->

        <dependency>

            <groupId>mysql</groupId>

            <artifactId>mysql-connector-java</artifactId>

            <version>8.0.33</version>

        </dependency>

    </dependencies>



    <build>

        <plugins>

            <plugin>

                <groupId>org.apache.maven.plugins</groupId>

                <artifactId>maven-compiler-plugin</artifactId>

                <version>3.11.0</version>

                <configuration>

                    <source>19</source>

                    <target>19</target>

                </configuration>

            </plugin>



            <plugin>

                <groupId>org.apache.maven.plugins</groupId>

                <artifactId>maven-war-plugin</artifactId>

                <version>3.3.2</version>

                <configuration>

                    <warName>user-management</warName>

                </configuration>

            </plugin>

        </plugins>



        <finalName>user-management</finalName>

    </build>

</project>





**Step 3: Save \& Update Project**

Ctrl+S to save

**Right-click project → Maven → Update Project**

Wait for dependencies to download

\---------------------------------------------------------------

**Part 3: Create Package Structure**

**Step 1:** Create Packages


**Right-click src/main/java → New → Package**



Create these packages:



org.example.util

org.example.model

org.example.dao

org.example.service

org.example.servlets



**Step 2:** Folder Structure

src/main/java/org/example/

├── util/

│   └── DBConnection.java

├── model/

│   └── User.java

├── dao/

│   └── UserDAO.java

├── service/

│   └── UserService.java

└── servlets/

    └── UserAPIServlet.java

\---------------------------------------------------------------

**Part 4: Configure Tomcat Server**

**Step 1: Add Tomcat Server**

**Window → Preferences → Server → Runtime Environments**

Click Add → Select Apache Tomcat v10.1

Browse to your Tomcat installation: D:\\apache-tomcat-10.1.59

Click Finish → Apply \& Close



**Step 2: Add Server to Eclipse**

Servers tab (bottom) → Right-click → New → Server

Select Apache Tomcat v10.1

Click Next → Add your project → Finish































