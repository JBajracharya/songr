## Songr Application

### Steps to run the application
```
1. Clone repo on the local machine.
2. Type './gradlew run' in terminal to start the program
3. Type localhost:8080/<routes> in the web browser to navigate to the different pages
```

### Routes:
```
* /hello: Displays hello word
* /capitalize/{any text}: Displays uppercase letter to any text typed in the {any text} field in the url
* /albums: Displays the list of albums and the form to add the albums and songs
* /songs/albumID: Displays list of songs in a particular album
```

### Functionalities:
```
* Uses postgres database to store song data
* Adding new albums with details such as title, number of songs, total song length, album image
* Adding songs to particular album with details such as song title, song length, track number
* Deleting any song from the album and update database
```

### Tools and programming languages used:
```
 Spring framework, thymeleaf, java, html, css, postgres, gradle 
```