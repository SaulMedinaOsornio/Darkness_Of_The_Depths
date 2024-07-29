const email = ""
const password = ""

document.getElementById('loginForm').addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent form from submitting normally

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (isValidEmail(email)) {
        if (isValidPassword(password)) {
            sendForm(email, password);
        } else {
            alert('Please enter a valid password. Password must be at least 8 characters long.');
        }
    } else {
        alert('Please enter a valid email address.');
    }
});

function isValidEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}

function isValidPassword(password) {
    return password !== null && password.length >= 8;
}

function sendForm(email, password) {
    const formData = new FormData();
    formData.append('email', email);
    formData.append('password', password);

    fetch('/login', {
        method: 'POST',
        body: formData
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            alert('Login successful!');
        })
        .catch((error) => {
            console.error('Error:', error);
            alert('There was an error with the login.');
        });
}

module.exports = { isValidEmail, isValidPassword };