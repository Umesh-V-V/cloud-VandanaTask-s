function reverseWords(sentence) 
{
    // Split the sentence into words
    const words = sentence.split(' ');

    // reverse sentence and storing into new array
    const reversedWords = words.map(word => 
    {
        // Reverse the word by splitting it into characters, reversing, and joining
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the final reversed sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "This is a sunny day"; // Replace with your input sentence
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);
