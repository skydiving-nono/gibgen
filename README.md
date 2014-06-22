**Code Challenge: Gibberish Generator**
---------------------------------------

Challenge Overview
------------------

**Your response to this challenge can be used to supplement your SWEAP application.  If you plan to complete this challenge for SWEAP, ensure you meet the other minimum requirements by visiting [here](http://gecapital.com/sweap "SWEAP Home Page").  Whether you apply or not, you are welcome to fork this repository and complete as a personal project challenge.**


We are exticed taht you are intsereted in joiinng the Soawtfre Engreeniing Appsecitnerhip Prargom.  Weoclme to yuor fsrit prommarging chanellge.  Yuor chnellage is to courtsnct a prrgoam taht tekas an Enilgsh txet snirtg as iupnt and rerutns rebadale giirebbsh lkie tihs.  It dseno’t mtaetr in waht oerdr the ltteres in a wrod are, but an iproamtnt tihng is taht the frsit and lsat ltteer be in the rghit pclae. The rset can be a taotl mses and you can sitll raed it whotuit a pboerlm.  Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe.

**The Basics:**
  
  - You may use *almost any* programming language... it's your choice.  See the supported options [here](http://ideone.com/).
  - Your program should leave the first and last letter of each word in place and scramble the rest.
  - Your program should not scamble punctuation (.,-'...etc.), numbers, or upper-case abbreviations.
  - For example gibberish, see the [/textfiles](https://github.com/sweap/gibgen/tree/master/textfiles) folder.  Two sample output files are provided: `xxx.txt.gib`

**Input/Output:**
 
  - Name your program as follows: `gibgen.xx` (where xx is variable based on the language you choose)
  - Your program should be able to read text input from a string passed into STDIN
      - `gibgen.xx "This is a String"`
      - `cat mystringfile.txt | gibgen.xx`
  - Your program should output to the console.

_Note: This challenge is based on a popular word gibberish meme. You can improve the readability by looking at a [researcher's take](http://www.mrc-cbu.cam.ac.uk/people/matt.davis/cmabridge/) on the truths/myths of this meme, but this is not required._

What to do
----------
1. [Download](http://git-scm.com/downloads) & install Git on your machine

2. <a href="https://github.com/sweap/gibgen/fork" class="btn grouped" data-method="POST" rel="nofollow" title="Fork">Fork</a> this project - Go [here](https://github.com/sweap/gibgen) and click the "Fork" button (located on the upper-right side of the screen)

2. Clone your new fork'd repository to your local machine - `git clone https://github.com/YOUR_USERNAME_HERE/gibgen.git`
3. Complete the code challenge and fill out the Quick Start & Questions in the the README (see below)
4. `git add` and `git commit` your local repository as you go
4. Push your code and README back to GitHub occasionally - `git push origin master`
5. Email [serp@ge.com](mailto:serp@ge.com) with the Commit URL to your fork'd repository that you want reviewed. It should include at least 2 files: (1) your updated README with Coding Questions answered, and (2) your program (gibgen.xx)
   - Go here: `https://github.com/YOUR_USERNAME_HERE/gibgen/commits/master`
   - Find the commit that you'd like us to review.  _The commit date must be on or before 11:59pm (central) on April 4, 2014!_
       - Click the "Browse Code ->" link for that commit
   - Copy and paste the URL into the email along with your name... it should look something like this:
       - `https://github.com/YOUR_USERNAME_HERE/gibgen/tree/73afe0c8fe2...hash.hash...e80afea72b6`

_Note: If you have any questions, email [serp@ge.com](mailto:serp@ge.com).  I will do my best to respond to any questions._

Judging Criteria
----------------

Your responses to the **Coding Questions** at the bottom of this README are the *Most Important* part of this challenge. A working, fully fault-tolerant program that we just can't break, albeit awesome, is the least important.  Why is that?  Remember, we don't expect you to be expert programmers (just yet)... We want to see how you think through a problem.  


For completion by applicant
===========================

Quick Start
-----------

* To execute this program:
	* compile program by calling 'javac gibgen.java' inside the directory of program from the command line
	* program should compile without error
	* after program has been compiled, run command 'java gibgen "your text here"'
	* replace "your text here" with the text you want scrambled; be sure to use quotation marks! Otherwise it will only scramble the first word!
	
* Java is the programming language used for this application.

* To run the program with the output of a textfile
 	* compile program by calling 'javac gibgen.java' inside the directory of program from the command line
	* program should compile without error
	* Call 'cat mystringfile.txt | java gibgen' and it will output the contents of the text file with the gibberish transformation applied


Coding Questions
----------------

** Question 1: "How did you approach the problem?" (500 words or less) **

To handle this problem I followed a similar method architects use when remodeling a building. When an architect remodels a building, he/she takes a plan of action to what he/she wants to do to the building, then breaks the building down and then reconstructs it according to the designed plan. The difference here is the building is never demolished, its main aspects/backbones are left in tact.To handle the jumbling of something like the words of a paragraph can follow the same path as the remodeling of a building. My first plan of action was to plan out how I wanted to handle jumbling the letters of many words, planning to plan. Before setting off on a coding frenzy, I sat down and wrote, on paper, the steps I thought would be best and most efficient for handling this problem. The approach I decided would be to take an entire paragraph, break that down into individual words, break those words down into an array of individual characters, then work my way back up reconstructing my paragraph (the building) with my new jumbled words (the renovations).Once my plans were tangible (out of my head and onto paper) I researched which tools I may need for this problem. Would I need anything for this program was not familiar with? File IO, Array manipulation, etc., do I know enough about these to write this program, if not, learn about them so handling this problem could be more efficient when the time came to write code.Finally the time came to write code. The program’s construction is as follows:
*	read input – take the text from the command line/file and feed that information into my program* manipulate input – once the input has been inserted into program, have a method to handle most of the work* return manipulated input to the command lineThe tool used by the program is below, allowing the program to be an index while the verbose description is in the corresponding method. The actual jumbling of the paragraph takes an entire paragraph, separating by each word and randomly jumbling the insides of individual words.Finally, I tested the program. Testing is where most of the work came from. Through testing I was able to come up with ideas and issues that I had not thought of in the first iteration of the program. The testing was fruitful and allowed me to finish a fully functional program that didn’t break at points it would break at before.


** Question 2: "What was the most difficult aspect of the solution?" (500 words or less) **

The most difficult aspect of the solution was the handling of the many little problems that would arise due to trying to stay in bounds of stipulations given. 

There was a recursive pattern of questions that would arise. The deeper I would try to specify bits of the program, the more I realized I would have to handle. 

For example, shuffling a paragraph of characters would be simple: build an array, fill it with characters, shuffle it, return the array. Well in this problem the words had to remain whole. So diving into that question led to handling another issue, shuffling the insides of the words while keeping the first/last characters the same. 

This aspect of the solution, the one-by-one handling of breaking down and rebuilding of the text was the most difficult. However, it was also the most fruitful. This forced a step-by-step handling of the problem, so it was almost impossible to break code, because in order to move forward onto a new problem, the task/problem at hand had to be taken care of.

