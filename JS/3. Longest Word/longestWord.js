/*
    Write a function, longestWord, that takes in a sentence string as an argument.
    The function should return the longest word in the sentence.
     If there is a tie, return the word that occurs later in the sentence.
 */

let longestWord = (sentence)=>{

    let wordsArr = sentence.split(' ');
    let longest = "q";

    wordsArr.forEach(word => {
        let length = word.length;
        length >= longest.length ? longest = word : false;
    })

    return longest;
}


longestWord("what a wonderful world");