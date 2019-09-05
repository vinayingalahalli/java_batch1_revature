// you can use ', ", or ` (back tic) to create strings in JS
let a = "hello";
let b = 'world';
let c = `The back tic allows us to create template literals
they allow for mulitiple lines. They also allow for string interpolation
which allows us to inject JS code into our string.
a = ${a} 
b = ${b} 
5 + 10 = ${5 + 10} 
`;

console.log(c);