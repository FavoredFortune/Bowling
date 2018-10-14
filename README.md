# Bowling

#Sooz Richman (Favored Fortune)

##Overview

Welcome to this command line application that generates bowling games and their final scores.
This means it constructs a game of 2 rolls per frame, for 9 frames and the 10th frame has 3 rolls.
The application will return the final scores of different game scores. Each game calculated will have 10 total frames.

- Regular frames are scored by adding the 2 rolls together, and will never = 10.
- Spare frames are when two rolls in a frame add up to 10. In this case the next roll, from the next frame is added 
to the initial frame's two rolls (i.e. Frame 1:roll 1 + Frame 1:roll 2 + Frame 2:roll3).
- Strikes are when the first roll of a frame is 10 points. In this case the next two rolls (the 2nd from the current 
frame and the 1st of the next frame, as noted in the Spare frames case) are added to the total for the score of 
initial strike frame. 


## Instructions for running application

- Open preferred IDE
- Refresh Gradle Build
- Choose to run the Main.java file from Run in the IDE menu
- Follow prompts in IDE Console


##Technologies Used

- Java 1.8 (aka Java 8)
- Gradle
- Git
- GitHub
- IntelliJ Ultimate

##Resources

- Reminder of printing from within an array list [StackOverflow](https://stackoverflow.com/questions/10168066/how-to-print-out-all-the-elements-of-a-list-in-java)
- 

