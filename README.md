1. Create a simple Greeter framework that helps users plug different
   type of messages (hardcoded strings, read from text files, etc) and
   prints them on the command line.
   ○ Make sure you use IoC to abstract the logic of printing the message away from
   the user
   ○ Hint: choose between Template method, Strategy and Service locator for the
   initial implementation
2. Implement a simple IoC container capable of DI and incorporate
   it into the Greeter framework
   ○ Choose between constructor and setter injection
   ○ Choose between a config file and config in code
   ○ If you’re all done and this was easy, implement configuration through
   annotations :)
 