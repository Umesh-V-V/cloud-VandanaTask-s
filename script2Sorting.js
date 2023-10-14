const arr = [5, 2, 9, 1, 5, 6];

// Custom comparison function for descending order
function compareDescending(a, b) {
    return b - a;
}

// Sort the array in descending order
arr.sort(compareDescending);

console.log(arr); // Output: [9, 6, 5, 5, 2, 1]
