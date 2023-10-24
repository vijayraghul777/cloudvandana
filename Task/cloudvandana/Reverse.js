function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
      // Reverse the word and preserve any non-alphabetical characters
      return word.split(/(\W+)/).map(part => {
        if (/^\w+$/.test(part)) {
          return part.split('').reverse().join('');
        }
        return part;
      }).join('');
    });
  
    // Join the reversed words to form the final sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  const inputSentence = "This is a sunny day";
  const reversedResult = reverseWords(inputSentence);
  console.log(reversedResult); // Output: "shiT si a ynnus yad"
  