# Bowling
Return final bowling game score of a game. 

# Sooz (aka Suzanne) Richman (Favored Fortune)

## Overview

Welcome to this application that generates bowling games and their final scores.
This means it constructs a game of 2 rolls per frame, for 9 frames and the 10th frame has 3 rolls.
The application will return the final scores of different game scores. Each game calculated will have 10 total frames.

- Regular frames are scored by adding the 2 rolls together, and will never = 10.
- Spare frames are when two rolls in a frame add up to 10. In this case the next roll, from the next frame is added 
to the initial frame's two rolls (i.e. Frame 1:roll 1 + Frame 1:roll 2 + Frame 2:roll3).
- Strikes are when the first roll of a frame is 10 points. In this case the next two rolls (from the next frame(s)) 
are added to the total for the score of initial strike frame. *


## Instructions for running application

- Open preferred IDE
- Refresh Gradle Build
- Choose to run the Main.java file from Run in the IDE menu**
- Follow prompts in IDE Console
- Note that each application runs quickly and you may have to scroll up in the console to see all contents

** - There is a hidden bonus application! Follow the instructions at the end of the Main application console readout.
You can get instructions to see bowling games randomly generated and then properly scored as many times as you like 
to run this second application (it's called FrameGenerator)

## Technologies Used

- Java 1.8 (aka Java 8)
- Gradle
- JUnit 4.2
- Git
- GitHub
- IntelliJ Ultimate

## Resources

- Reminder of printing from within an array list [StackOverflow](https://stackoverflow.com/questions/10168066/how-to-print-out-all-the-elements-of-a-list-in-java)
- *Scoring of Strikes from [Wikipedia](https://en.wikipedia.org/wiki/Strike_(bowling))
- *Scoring of perfect game [Slocums Homestead](http://slocums.homestead.com/gamescore.html)

## HISTORY OF BOWLING
For more on the history of bowling please see the [Bowling Museum Website](https://www.bowlingmuseum.com/Visit/Education/History-of-Bowling)
For more on the history of bowling in the United States please see [American Ten Pins](http://www.americantenpins.com/PartOne.htm#theoriginalamericansocialnetwork)

## Fun Bowling facts
- Bowling was believed to be first invented in Egypt around 5,000 B.C. *source is Bowling Museum website - see link 
above
- Did you know, that as of 2009, the largest bowling center in the world was certified by Guinness World Records 
confirms that the largest bowling center in the world is Inazawa Grand Bowl in Japan, featuring 116 consecutive 
Brunswick Bowling wooden lanes on a single floor, which are being replaced and upgraded with Brunswick Pro Lane™ 
synthetic lanes in early 2010. *Source: [Bowling Digital](https://www.bowlingdigital.com/bowl/node/7445)
- Presently, bowling is played by more than 95 million people worldwide in over 90 countries. *Source: [Bowling 
Universe](https://www.thebowlinguniverse.com/blogs/news/history-of-bowling)