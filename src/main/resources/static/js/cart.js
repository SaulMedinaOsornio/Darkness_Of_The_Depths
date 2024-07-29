document.addEventListener('DOMContentLoaded', function () {
    const quantityElement = document.getElementById('quantity');
    const buttonMore = document.getElementById('button_more');
    const buttonMinus = document.getElementById('button_minus');
    const buttonDelete = document.getElementById('button_delete');
    const productContainer = document.getElementById('product_container_cart');

    buttonMore.addEventListener('click', function () {
        let currentQuantity = parseInt(quantityElement.textContent, 10);
        if (currentQuantity < 15) {
            quantityElement.textContent = currentQuantity + 1;
        } else {
            alert('No puedes comprar más de 15 unidades.');
        }
    });

    buttonMinus.addEventListener('click', function () {
        let currentQuantity = parseInt(quantityElement.textContent, 10);
        if (currentQuantity > 1) {
            quantityElement.textContent = currentQuantity - 1;
        }
    });

    buttonDelete.addEventListener('click', function () {
        // Confirma que el usuario desea eliminar el producto
        if (confirm('¿Estás seguro de que deseas eliminar este producto?')) {
            // Elimina el contenedor del producto
            productContainer.remove();
        }
    });
});

document.addEventListener('DOMContentLoaded', function () {
    const productContainer = document.getElementById('product_container_cart');

    // Función para crear el HTML para un producto
    function createProductHtml(product) {
        return `
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
    }

    // Función para cargar los productos desde el backend
    function loadProducts() {
        fetch('/api/products')
            .then(response => response.json())
            .then(products => {
                products.forEach(product => {
                    productContainer.innerHTML += createProductHtml(product);
                });

                // Después de añadir los productos, inicializa los botones
                initializeButtons();
            })
            .catch(error => console.error('Error fetching products:', error));
    }

    // Función para inicializar los eventos de los botones
    function initializeButtons() {
        const buttonsMore = document.querySelectorAll('.button_more');
        const buttonsMinus = document.querySelectorAll('.button_minus');
        const buttonsDelete = document.querySelectorAll('.button_delete');

        buttonsMore.forEach(button => {
            button.addEventListener('click', function () {
                const quantityElement = this.closest('.target').querySelector('.quantity');
                let currentQuantity = parseInt(quantityElement.textContent, 10);
                if (currentQuantity < 15) {
                    quantityElement.textContent = currentQuantity + 1;
                } else {
                    alert('No puedes comprar más de 15 unidades.');
                }
            });
        });

        buttonsMinus.forEach(button => {
            button.addEventListener('click', function () {
                const quantityElement = this.closest('.target').querySelector('.quantity');
                let currentQuantity = parseInt(quantityElement.textContent, 10);
                if (currentQuantity > 1) {
                    quantityElement.textContent = currentQuantity - 1;
                }
            });
        });

        buttonsDelete.forEach(button => {
            button.addEventListener('click', function () {
                if (confirm('¿Estás seguro de que deseas eliminar este producto?')) {
                    const productElement = this.closest('.target');
                    productElement.remove();
                }
            });
        });
    }

    // Cargar productos al iniciar la página
    loadProducts();
});
