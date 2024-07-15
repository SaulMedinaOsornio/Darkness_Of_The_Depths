async function showProducts() {
    const request = await fetch('/index', {
        method: 'GET',
        headers: {
            'Acept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const content = await request.json();
    console.log(content)
}