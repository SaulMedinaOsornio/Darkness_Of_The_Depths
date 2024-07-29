function searchProducts() {
    const searchInput = document.getElementById('search-input');
    const query = searchInput.value.trim();

    fetch(`/api/products?search=${encodeURIComponent(query)}`)
        .then(response => response.json())
        .then(products => {
            const productContainer = document.getElementById('product_container_cart');
            productContainer.innerHTML = ''; // Limpia el contenedor antes de añadir productos
            products.forEach(product => {
                productContainer.innerHTML += `
                    <div class="target" data-id="${product.id}">
                        <div class="container_img">
                            <img src="${product.imageUrl}" alt="image_cd" />
                        </div>

                        <div class="container_info">
                            <p>Album: ${product.album}</p>
                            <p>Band: ${product.band}</p>
                            <p>Year: ${product.year}</p>
                            <p>Price: ${product.price} USD</p>
                            <p>Cantidad: <span class="quantity">${product.quantity}</span></p>
                        </div>

                        <div class="buttons_container">
                            <div id="button_delete_cont">
                                <button class="button_delete">Delete</button>
                            </div>

                            <div id="button_add_container">
                                <button class="button_more">+</button>
                                <button class="button_minus">-</button>
                            </div>
                        </div>
                    </div>
                `;
            });

            // Después de añadir los productos, inicializa los botones
            initializeButtons();
        })
        .catch(error => console.error('Error fetching products:', error));
}
