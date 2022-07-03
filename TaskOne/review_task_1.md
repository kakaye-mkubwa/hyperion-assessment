## **Task 1**
##### Correctness

1. In `line 2` you have defined the `groupAnagrams` function, but fail to 
apply the proper indentation in the lines of codes encapsulated within 
that function, `line 3` to `line 10`. Apply proper indentation on this 
code block, that is:


    def groupAnagrams(self, strs):
        # function related code goes here
        result = {}
        for i in strs:
            x = "".join(sorted())
            if x in result:
                result[x].append(i)
            else:
                result[x] = [i]
        return list(result.values())
2. In `line 5`, the function `sorted()`, expects you to provide an argument, that is, the data to
 be sorted:
  
        x = "".join(sorted())
  
3. In this case, the individual items from the strs list `["eat", "tea", "tan", "ate", "nat", "bat"]`
 is what is needed, so edit that `line 5` to sort the individual character elements in i, as shown below
 
        x = "".join(sorted(i))     
        
With those changes, the program will compile successfully

##### Documentation

1. It is highly advisable to document your code. This makes it easier to 
communicate details on what the function does, since at times you might be 
collaborating with other people and they need to know how your code works. Furthermore, 
you might come back to this code months from now and will need to remember 
what it does prior to modifying it.
For example:

        """
        Group anagrams together
        :param strs: 
            a list of words
        :return: 
            A list of the grouped lists of dictionary values
        """
        
Check out more details on documentation to grasp more on this.

##### Style
1. Check on the indentation of code. Indentation of code is crucial to 
the working of a Python program, you might get the logic write but 
missing on this might have you stuck at one place.
2. It's advisable to name functions in Python using `snake_case`, as 
opposed to `camelCase`, which you have used in your program in the naming of 
 `groupAnagrams(self,strs)`. You can change it to, `group_anagrams(self,strs)`.
 
3. In the naming of variables, you have done a good job, however in `line 11`, 
try to make use of a word(s) that can easily communicate more on the object.
 
4. Have a spacing of 2 lines or so after a class or function definition. 
Between `line 10` and `line 11` you should introduce a spacing of 2 line or so
 as shown below:
 
                return list(result.values())
        
        
        ob1 = Solution()
        print(ob1.group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
        
   
##### Efficiency
Good job on this, no unnecessary loops noted and good choice of data structure used.
You can consider factoring in the possibility of having an empty array as input in 
the function, this will save memory by avoiding some minute unnecessary processes.


##### General Comments
Generally, the logic to the solution you have provided is quite commendable, check on the 
aforementioned areas, most importantly, indentation.