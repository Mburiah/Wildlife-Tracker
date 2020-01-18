# WILDLIFE TRACKER

## Author
Mburiah

## Description
This is an application to track wildlife in Douglas fir forest for a case study on whether the forest authority should allow deforestation or not. This application allows rangers to track wildlife sightings in the area.

 
[![codebeat badge](https://codebeat.co/badges/f2e546bf-751a-41f7-b9cd-8fe4bbca4067)](https://codebeat.co/projects/github-com-mburiah-wildlife-tracker-master)
## Functionality

 | Input | Description| Output |
 |:---    | ---: | ---: |
 | Add animal | click on the add animal button | animal added to list. |   
 | Add sighting | click on add sighting button  | new sighting is added  |
 | View animals/ sightings | click on link on the navigation bar | all recorded animals and sightings are seen |
 


## Pre-requisites
1.You need to have java installed. You can use [sdkman](https://sdkman.io/).
Follow the instructions on the _sdkman_ installation process. Then install java:
 ```bash
sdk install java
 ```

2.Gradle
This is a build tool for the java app, you can install it through sdkman:
```bash
sdk install gradle
```
## Setup
1. You will need Internet connection.

2. Get to this Wildlife-tracker repo on github.

Link:-> ```https://github.com/Mburiah/Wildlife-Tracker.git```

3. From there you can access the Hero-Squad.

4. **Clone** the project.

5. **get into project folder** (cd into project).

6. If you have all the **Pre-requisites** you can run the application.
 ``` bash
gradle run
 ```
navigate to localhost:4567 to view the website.

### Database;
7. Install postgres. Once ready, type *psql* on the terminal. Create User with password, Make sure to edit the DB.java file with the credentials created in order to connect to your database.
8. Create tables to store animals and sightings details: user# CREATE DATABASE wild_track;
9. Navigate to wild_track database, then wild_track# CREATE TABLE animals ( animal_id int, animal_age int, animal_name string);
10. Create  sightings table: wild_track# CREATE TABLE sightings ( animal string, location string, ranger_name string );
11. Connect to database: \c

##Technologies used
- Java , intellij IDEA
- **[Maven] (https://maven.apache.org/)**
- Heroku CLI
- Bootstrap.
- Cascading Style Sheets.
- Handlebars.

## Contributions and support.
In case of any issues, bugs, or you would like to contribute or support, contact me via: 
- Email :- mburiahb@gmail.com.
- Github-Username :- Mburiah
