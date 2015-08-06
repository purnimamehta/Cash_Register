//name:Purnima Mehta
//date:April 16
//purpose: Making a program that takes in the amount that the customer's purchases cost and the amount that the customer paid.

public class CashRegister
{
    public static void main (String args[])
    {
	new CashRegister ();
    }


    public CashRegister ()
    {
	System.out.println (" W E L C O M E");
	System.out.println ("");
	String secret = "himalayas";
	String guess = "";
	int count = 0; //This is to count their guesses.
	//While they haven't got it and they haven't guessed too many times
	while (!guess.equals (secret) && count < 5)
	{
	    //The password is "himalayas".
	    guess = IBIO.inputString (" Enter the password to continue: ");
	    if (!guess.equals (secret))
	    {
		//If the password is not correct for five tries then thiswill show up.
		System.out.println (" Sorry please try again.");
		count++;
	    } //if for incorrect guess
	} //while they don't get the password right
	if (count >= 5) //if they were unsuccessful 5 times
	{
	    System.out.println (" Too many unsuccessful attempts.");
	    System.out.println (" ** Program will stop after 1 second. ** ");
	    try
	    {
		//The program stops for 1 second.
		Thread.sleep (1000);
	    }
	    catch (InterruptedException ie)
	    {
	    }
	    System.exit (1);
	}
	else //else they have logged on
	{
	    System.out.println (" Correct, please continue.");

	}
	//Printing the ASCII arts slowly on thr computer screen.
	printSlow ("                                                           *********************************");
	printSlow ("                                                           **  W E L C O M E  T O  T H E  **");
	printSlow ("                                                           *********************************");
	printSlow ("");
	printSlow ("            ____                    ___             ________");
	printSlow ("           6MMMMb/                  `MM             `MMMMMMMb.                   68b ");
	printSlow ("          8P    YM                   MM              MM    `Mb                   Y89         MM ");
	printSlow ("         6M      Y    ___     ____   MM  __          MM     MM   ____     __     ___   ____  MM      ____  ___  __  ");
	printSlow ("         MM         6MMMMb   6MMMMb  MM 6MMb         MM     MM  6MMMMb   6MMbMMM`MM  6MMMMb MMMMM   6MMMMb `MM 6MM  ");
	printSlow ("         MM        8M'  `Mb MM'    ` MMM9 `Mb        MM    .M9 6M'  `Mb 6M'`Mb   MM MM'     `MM    6M'  `Mb MM69  ");
	printSlow ("         MM            ,oMM YM.      MM'   MM        MMMMMMM9' MM    MM MM  MM   MM YM.      MM    MM    MM MM' ");
	printSlow ("         MM        ,6MM9'MM  YMMMMb  MM    MM        MM  MM   MMMMMMMM YM.,M9    MM  YMMMMb  MM    MMMMMMMM MM  ");
	printSlow ("         YM      6 MM'   MM      `Mb MM    MM        MM   MM  MM        YMM9     MM      `Mb MM    MM       MM  ");
	printSlow ("          8b    d9 MM.  ,MM L    ,MM MM    MM        MM    MM YM    d9 (M        MM L    ,MM YM.  ,YM    d9 MM  ");
	printSlow ("           YMMMM9  `YMMM9'YbMYMMMM9 _MM_  _MM_      _MM_    MM_YMMMM9   YMMMMb. _MM_MYMMMM9   YMMM9 YMMMM9 _MM_ ");
	printSlow ("                                                                        6M    Yb ");
	printSlow ("                                                                        YM.   d9 ");
	printSlow ("                                                                         YMMMM9 ");
	printSlow (" ");
	printSlow (" ***********************************************************  **************** ******************************************* ");
	printSlow (" ***********************************************************  ** O F  T H E ** ******************************************* ");
	printSlow (" ***********************************************************  **************** ******************************************* ");
	printSlow ("                        ____    ____                             ___ ");
	printSlow ("                        `MM'    `MM'68b                          `MM ");
	printSlow ("                         MM      MM Y89                           MM ");
	printSlow ("                         MM      MM ___ ___  __    __      ___    MM    ___  ____    ___   ___     ______ ");
	printSlow ("                         MM      MM `MM `MM 6MMb  6MMb   6MMMMb   MM  6MMMMb `MM(    )M' 6MMMMb   6MMMMb/");
	printSlow ("                         MMMMMMMMMM  MM  MM69 `MM69 `Mb 8M'  `Mb  MM 8M'  `Mb `Mb    d' 8M'  `Mb MM' ");
	printSlow ("                         MM      MM  MM  MM'   MM'   MM     ,oMM  MM     ,oMM  YM.  ,P      ,oMM YM. ");
	printSlow ("                         MM      MM  MM  MM    MM    MM ,6MM9'MM  MM ,6MM9'MM   MM  M   ,6MM9'MM  YMMMMb ");
	printSlow ("                         MM      MM  MM  MM    MM    MM MM'   MM  MM MM'   MM   `Mbd'   MM'   MM      `Mb ");
	printSlow ("                         MM      MM  MM  MM    MM    MM MM.  ,MM  MM MM.  ,MM    YMP    MM.  ,MM L    ,MM ");
	printSlow ("                        _MM_    _MM__MM__MM_  _MM_  _MM_`YMMM9'Yb_MM_`YMMM9'Yb.   M     `YMMM9'YbMYMMMM9 ");
	printSlow ("                                                                                 d' ");
	printSlow ("                                                                             (8),P ");
	printSlow ("                                                                              YMM ");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");


	//Inputting values for all variables used in the program.
	double chickensalad = 4.99;
	double greensalad = 3.99;
	double smallfries = 1.99;
	double mediumfries = 2.39;
	double largefries = 2.99;
	double poutine = 4.00;
	double chickenburger = 6.99;
	double beefburger = 5.99;
	double hamburger = 5.99;
	double chickennugget = 4.99;
	double chickenwrap = 3.99;
	double beefwrap = 2.99;
	double eggsandwich = 3.99;
	double colddrinks = 0.99;
	double icecream = 2.99;
	double strawberryfrosty = 3.99;
	double chocolatefrosty = 3.99;
	double caramelfrosty = 3.99;
	double chickencombo = 9.99;
	double beefcombo = 8.99;
	double hamcombo = 8.99;

	int fiftydollarbill;
	int twentydollarbill;
	int tendollarbill;
	int fivedollarbill;
	int toonie;
	int loonie;
	int quarter;
	int dime;
	int nickel;
	int pennies;


	String items = "";
	String ready = "y";

	double total = 0; //With Taxes
	double price = 0; //Without Taxes

	System.out.println ("                                  ***********************************");
	System.out.println ("                                  ***********************************");
	System.out.println ("                                  ** --------  <> Menu <> -------- **");
	System.out.println ("                                  ** Item                # Price $ **");
	System.out.println ("                                  ** Chicken salad       1 : $4.99 **");
	System.out.println ("                                  ** Green salad         2 : $3.99 **");
	System.out.println ("                                  ** Fries (small)       3 : $1.99 **");
	System.out.println ("                                  ** Fries (medium)      4 : $2.39 **");
	System.out.println ("                                  ** Fries (large)       5 : $2.99 **");
	System.out.println ("                                  ** Poutine             6 : $4.00 **");
	System.out.println ("                                  ** Chicken Burger      7 : $6.99 **");
	System.out.println ("                                  ** Beef Burger         8 : $5.99 **");
	System.out.println ("                                  ** Ham Burger          9 : $5.99 **");
	System.out.println ("                                  ** Chicken Nugget     10 : $4.99 **");
	System.out.println ("                                  ** Chicken Wrap       11 : $3.99 **");
	System.out.println ("                                  ** Beef Wrap          12 : $2.99 **");
	System.out.println ("                                  ** Egg Sandwich       13 : $3.99 **");
	System.out.println ("                                  ** Cold Drinks        14 : $0.99 **");
	System.out.println ("                                  ** Ice Cream          15 : $2.99 **");
	System.out.println ("                                  ** Strawberry Frosty  16 : $3.99 **");
	System.out.println ("                                  ** Chocolate Frosty   17 : $3.99 **");
	System.out.println ("                                  ** Caramel Frosty     18 : $3.99 **");
	System.out.println ("                                  ** Chicken Combo      19 : $9.99 **");
	System.out.println ("                                  ** Beef Combo         20 : $8.99 **");
	System.out.println ("                                  ** Ham Combo          21 : $8.99 **");
	System.out.println ("                                  ***********************************");
	System.out.println ("                                  ***********************************");

	System.out.println ("");
	System.out.println ("");

	//Press any key on the keyboard. Example (enter).
	items = IBIO.inputString (" Press any key to continue >> ");
	System.out.println ("");
	while (ready.equals ("y"))
	{
	    //Please input the number given to each items inorder for the program to function properly.
	    //Number for each items can be found in the menu.
	    //Note that there are only 21 items on the menu. If you happened to input 22 or up by any chance then the program will reapeat the same question again.
	    items = IBIO.inputString (" Select an item >> ");

	    //You have inputted 1 as your item number.
	    if (items.equals ("1"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Chicken Salad : $4.99 ");
		price = price + chickensalad;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 2 as your item number.
	    else if (items.equals ("2"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Green Salad : $3.99 ");
		price = price + greensalad;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 3 as your item number.
	    else if (items.equals ("3"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Fries(small): $1.99 ");
		price = price + smallfries;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 4 as your item number.
	    else if (items.equals ("4"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Fries (medium): $2.39 ");
		price = price + mediumfries;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 5 as your item number.
	    else if (items.equals ("5"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Fries (large): $2.99 ");
		price = price + largefries;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 6 as your item number.
	    else if (items.equals ("6"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Poutine: $4.00 ");
		price = price + poutine;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 7 as your item number.
	    else if (items.equals ("7"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Chicken Burger: $6.99 ");
		price = price + chickenburger;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 8 as your item number.
	    else if (items.equals ("8"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Beef Burger: $5.99 ");
		price = price + chickenburger;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 9 as your item number.
	    else if (items.equals ("9"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Ham burger: $5.99 ");
		price = price + hamburger;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 10 as your item number.
	    else if (items.equals ("10"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Chicken nugget: $4.99 ");
		price = price + chickennugget;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 11 as your item number.
	    else if (items.equals ("11"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Chicken Wrap: $3.99 ");
		price = price + chickenwrap;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 12 as your item number.
	    else if (items.equals ("12"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Beef Wrap: $3.99 ");
		price = price + beefwrap;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 13 as your item number.
	    else if (items.equals ("13"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Egg Sandwich: $3.99 ");
		price = price + eggsandwich;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 14 as your item number.
	    else if (items.equals ("14"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Cold Drinks: $0.99 ");
		price = price + colddrinks;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 15 as your item number.
	    else if (items.equals ("15"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Ice Cream: $2.99 ");
		price = price + icecream;
		System.out.println ("");
		total = price + (price * 0.13);
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 16 as your item number.
	    else if (items.equals ("16"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Strawberry Frosty: $3.99 ");
		price = price + strawberryfrosty;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 17 as your item number.
	    else if (items.equals ("17"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Chocolate Frosty: $3.99 ");
		price = price + chocolatefrosty;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 18 as your item number.
	    else if (items.equals ("18"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Caramel Frosty: $3.99 ");
		price = price + caramelfrosty;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 19 as your item number.
	    else if (items.equals ("19"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Chicken Combo: $9.99 ");
		price = price + chickencombo;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 20 as your item number.
	    else if (items.equals ("20"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Beef Combo: $8.99 ");
		price = price + beefcombo;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	    //You have inputted 21 as your item number.
	    else if (items.equals ("21"))
	    {
		System.out.println ("");
		System.out.println (" The selected item is Ham Combo: $8.99 ");
		price = price + hamcombo;
		System.out.println ("");
		total = price + (price * 0.13);
		//This is the total cost for all the items you have inputted so far.
		System.out.println (" Your total is $" + round (total, 2) + ".");
		System.out.println ("");
		//Input "y" to add more items.
		//Input "n" or anything else than "y" to complete the payment.
		ready = IBIO.inputString (" Do you want to buy more items (y / n)? ");
		System.out.println ("");
		System.out.println (" ___________________________________________");
		System.out.println (" ___________________________________________");
		System.out.println ("");
	    }
	}
	System.out.println (" Total     >> $" + round (total, 2));
	double cashpaid = IBIO.inputDouble (" Cash Paid >> $");
	double change = cashpaid - total;
	System.out.println ("");
	System.out.println ("          Processing...");
	System.out.println ("          .............");
	System.out.println ("");

	try
	{
	    Thread.sleep (2000);
	}
	catch (InterruptedException ie)
	{
	}


	System.out.println (" Total Change    >> $" + round (change, 2));

	//Calculations for the amount of bills/ coins you need to provide the customers are done here.
	fiftydollarbill = (int) (change / 50);
	change = change - fiftydollarbill * 50;

	twentydollarbill = (int) (change / 20);
	change = change - twentydollarbill * 20;

	tendollarbill = (int) (change / 10);
	change = change - tendollarbill * 10;

	fivedollarbill = (int) (change / 5);
	change = change - fivedollarbill * 5;

	toonie = (int) (change / 2);
	change = change - toonie * 2;

	loonie = (int) (change / 1);
	change = change - loonie * 1;

	quarter = (int) (change / 0.25);
	change = change - quarter * 0.25;

	dime = (int) (change / 0.10);
	change = change - dime * 0.10;

	nickel = (int) (change / 0.05);
	change = change - nickel * 0.05;

	pennies = (int) (change / 0.01);
	change = change - pennies * 0.01;

	System.out.println ("");
	//Number of bills/coins you need to give to the customers for change are provided here to save time.
	System.out.println (" Number of bills / coins you need: ");
	System.out.println (" Fifty dollar bill  : " + round (fiftydollarbill, 0) + "");
	System.out.println (" Twenty dollar bill : " + round (twentydollarbill, 0) + "");
	System.out.println (" Ten Dollar Bill    : " + round (tendollarbill, 0) + "");
	System.out.println (" Five Dollar Bill   : " + round (fivedollarbill, 0) + "");
	System.out.println (" Toonie             : " + round (toonie, 0) + "");
	System.out.println (" Loonie             : " + round (loonie, 0) + "");
	System.out.println (" Quarters           : " + round (quarter, 0) + "");
	System.out.println (" Dime               : " + round (dime, 0) + "");
	System.out.println (" Nickel             : " + round (nickel, 0) + "");
	System.out.println (" Pennies            : " + round (pennies, 0) + "");

	System.out.println ("");
	//Input "y" to repeat the program.
	//Input "n" or anything else than "y" to stop the program.
	String question = IBIO.inputString (" Do you want to continue using the cash register program for another customer (y / n)? ");

	if (question.equalsIgnoreCase ("y"))
	{
	    System.out.println ("");
	    System.out.println (" ____________________________________________________________________________________________________________________________________");
	    System.out.println ("\n\n");
	    new SmritiNeupane_Cash_Register_717409 ();
	}
	else
	{
	    System.out.println ("");
	    System.out.println ("                      >>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
	    System.out.println ("                      >>> The program has now stopped! <<<");
	    System.out.println ("                      >>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
	}
    }


    //This is the code for rounding.
    public double round (double num, int digit)
    {
	double num2 = num * Math.pow (10, digit);
	double num3 = (num2 - ((int) num2)) * 10;
	num2 = ((int) num2);
	if (num3 >= 5)
	    num2++;
	return num2 /= Math.pow (10, digit);
    }


    //This is the code for print slow.
    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //Sleeps for a bit after printing a letter.
	    try
	    {
		Thread.sleep (1);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }

	}
	System.out.println ();
    }
}

