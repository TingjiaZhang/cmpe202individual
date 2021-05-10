# cmpe202individual

Part 1:
 Describe what is the primary problem you try to solve.

For me, the primary problem is to set the card number limit. Firstly, I try to read the card number in CSV file in integer form, but the range for int is not large enough, then I try to use long to fill the card number. However, when I am using long and print it with Scanner, the number is always required to end up with a “L”, which the console cannot read, and in that case, I cannot meet the requirement that the first digit of card number should be a specific number like 4, etc. Finally, I change a method and solver it.  

Second problem is to confirm the type of the card. I add different if loop to make it different. The test user should see the requirement to choose a card type by typing its name and then will have different limit for different choice(for example, the Visa card should have 16 digits and first digit is 4).

 Describe what design pattern(s) you use how (use plain text and diagrams).

Mainly I use Structural Patterns, the main class is the credit card in this project, and all other functions work for it. To make the project works good, it need a good structure, in which case the main function can call the function it want and it is very clear to see and change the structure. For this project, the core structure is made up by credit_card class and Read_CSV class. 



![Uploading image.png…]()
