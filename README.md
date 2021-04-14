# AdapterLesson

What?

Works as a bridge between two incompatible interfaces based on a client centric approach. Which basically integrates one interface with another. Some prebuilt examples of this that we’ve used is converting an array to a list. If you are adding functions to your adapter this falls into a decorator pattern instead.

So how can we apply a real world example of this to coding?
Using an example of a music player we know there are many media types for audio (mp3, mp4, VCL, etc.) but how can we get our code to read the different media types? 
1.	Let’s start by creating our main interface that we’ll call MediaPlayer that we want to add a method called play that takes the parameters for the audio type and the song name as a string and returns nothing 
2.	Next we need an audioplayer class that implements our mediaplayer and as you guys know interfaces are abstract so anything that implements them must override the methods in the interface. So let’s set up an if statement for an mp3 and what we want to sout
3.	Let’s create a main where we can call on this play method by first creating an audioplayer object and calling the method on it. We can see that when we input anything other than an mp3 we won’t get anything to print out. So, this is where our adapter comes into play
4.	Let’s create another interface called Advanced media player and create a couple specific play methods with a given type and only take a songname parameter.
5.	As we did with our MediaPlayer interface, lets create our two classes for our methods to be run from our AdvancedMediaPlayer interface 
6.	Since we have a method for our VLC and MP4 that have to be implemented we won’t touch the method that isn’t involved with that player type but sout the same as the media player except obviously change the audio type it prints out
7.	Now finally this is where our adapter comes into play, let’s make a class called MediaAdpater which will implement our MediaPlayer
8.	This will of course override our play method from our mediaplayer and in here we want to catch our two specific audiotypes using if statement. But we aren’t done here. The adapter isn’t connected to our mediaplayer just yet
9.	In this mediaadpater class we have to create a constructor for the media adapter that creates objects for the media types we created
10.	 Then we can go back into our audio player and create our mediaadapter instance variable that we can use now for an else if to get our other two types of play types 
11.	And if you’re feeling fancy you can finish with an else that catches any media type we didn’t utilize in our specified music types.
12.	Then finally we can go back into our main and test out our adapter.
