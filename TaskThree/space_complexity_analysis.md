# Worst-case space complexity
I have highlighted the code with corresponding worst-case space complexity 
for executing each line

        long input = 1128435347; // O(1)

        Driver driver = new Driver(); // O(1)


        if (!driver.validateInput(input)){ //O(1)
            System.out.println("Number must be between 0 to 999,999,999,999,999.");
            return;
        }

        inputCharArray = String.valueOf(input).toCharArray(); //O(n)
   

        driver.loadVoiceNumbersHashMap(); //O(n)
        driver.loadPlaceValueVoicesHashMap(); //O(n)

        driver.loadPlaceGroupStack(); //O(log n) + O(n)

        System.out.println(driver.voiceNumber()); // O(1) + O(1) + O(n)
        
    
The overall worst-case space complexity is therefore:

    O(n) + O(log(n))
    
