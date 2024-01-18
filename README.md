# ShoppingCart

I choose to solve this coding problem in Java because I am proficient in Java, unlike PHP, JavaScript, and Python. I am confident in my Java skills and believe it provides me with the best opportunity to showcase my abilities. Additionally, I want to emphasize that I am a quick learner. While I may not have extensive experience in Python and JavaScript, I am confident that I can rapidly acquire proficiency in these languages if given the chance. I am eager to demonstrate my adaptability and commitment to learning new technologies.
Product Information: The program defines three arrays (products, prices, and quantities) to store information about three products. It also uses a boolean array (giftWraps) to store whether each product is wrapped as a gift.

User Input: The program uses a Scanner to prompt the user to input the quantity and gift wrap choice for each product. The input is stored in corresponding arrays.

Calculating Subtotal: The code calculates the subtotal by multiplying the price of each product by its quantity and summing up the results.

Applying Discount Rules: The program applies various discount rules based on the total quantity of products and the quantity of individual products. The discounts are calculated and stored in the discount variable.

Calculating Gift Wrap Fee: The code calculates the gift wrap fee based on the quantities and whether each product is wrapped as a gift.

Calculating Shipping Fee: The program calculates the shipping fee based on the total quantity of products, considering that 10 units can be packed in one package with a $5 fee per package.

Calculating Total: The total cost is calculated by subtracting the discount from the subtotal and adding the gift wrap fee and shipping fee.

Displaying Order Details: The program prints detailed information for each product, including the quantity and total cost.

Displaying Subtotal, Discount, Gift Wrap Fee, Shipping Fee, and Total: The final step involves printing the subtotal, applied discount, gift wrap fee, shipping fee, and the total cost to the user.

Closing Scanner: The program closes the Scanner to release system resources.

Output:

Enter the quantity of Product A: 15
Is Product A wrapped as a gift? (true/false): true
Enter the quantity of Product B: 12
Is Product B wrapped as a gift? (true/false): false
Enter the quantity of Product C: 8
Is Product C wrapped as a gift? (true/false): false

Order Details:
Product A - Quantity: 15 - Total: $300.0
Product B - Quantity: 12 - Total: $480.0
Product C - Quantity: 8 - Total: $400.0

Subtotal: $1180.0
Discount Applied: $3.5
Gift Wrap Fee: $15.0
Shipping Fee: $25.0
Total: $1216.5
