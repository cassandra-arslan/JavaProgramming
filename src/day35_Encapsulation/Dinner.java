package day35_Encapsulation;

public class Dinner {

}
/*
1. Square Task:
        1.1 Create a class named Square:
        Private variables:
        side

        Encapsulate all the fields

        Condition:
        side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

        Methods:
        calcArea(): returns the area of square
        calcPerimeter(): returns the perimeter of square
        toString(): can display the side, area, perimeter of square when object is passed in print statement


        2. Rectangle Task:
        2.1 Create a class named Rectangle:
        Private variables:
        width, length

        Encapsulate all the fields
        Conditions:
        width of the rectangle should not be negative
        length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

        Methods:
        calcArea(): returns the area of rectangle
        calcPerimeter(): returns the perimeter of rectangle
        toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

        3. Carpet Task
        3.1create a class named Carpet:
private variables:
        width, length, unitPrice, isPersian (boolean)

        Encapsulate all the fields:
        Conditions:
        width can not be negative
        width can not be negative
        unit price can not be negative

        Add a constructor to set all the instances
        instance methods:
        calcCost(): should be able to calculate the total cost of the carpet and return it as double
        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
        total price of carpet = (width*length)*unitPrice
        if the carpet is persian  carpet, add 200$ to the totalPrice



        4. Item Task
        4.1create a class called Item
private variables:
        name, unitPrice, quantity

        Encapsulate all the fields:
        Conditions:
        name can not be empty or blank
        name can not contain any special characters other than space
        name must start with letters
        unit price can not be negative
        quantity can not be negative
        if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

        instance methods:
        calcCost(): returns the total cost
        toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()


        5. Pizza Task:
        5.1 Create class named Pizza:
private variables:
        size, numberOfCheeseTopping, numberOfPepperoniTopping

        Encapsulate all the fields
        Conditions:
        size of the pizza can only be small, medium, large. case insensitive

        Number of cheese topping can not be negative, the maximum number of cheese topping is:
        small: 3
        medium: 4
        large: 5

        Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

        small: 4
        medium: 5
        large: 6

        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)


        Methods:
        calcCost(): returns the totalCost of the pizza
        toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
        S: $10 + $2 per topping
        M: $12 + $2 per topping
        L: $14 + $2 per topping

*/