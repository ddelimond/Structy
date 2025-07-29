/*
Write a function, maxValue, that takes in array of numbers as an argument.
The function should return the largest number in the array.
Solve this without using any built-in array methods.
You can assume that the array is non-empty.
 */

const maxValue = (nums) =>{

    let largest = nums[0];

    let size = nums.length;

    for(let i = 1; i<= size; i++){
        nums[i] > largest ? largest = nums[i]:false
    }

    return largest;

}

maxValue([-5, -2, -1, -11])