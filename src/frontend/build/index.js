
let bookList = document.getElementById("bookContainer");
let refreshBtn = document.getElementById("refreshBtn");

const createCard = (title, author, pages) => {
    const cardContainer = document.createElement("div");
    cardContainer.classList.add("cardContainer");
    bookList.appendChild(cardContainer)

    const bookTitle = document.createElement("h1");
    bookTitle.innerHTML = "Title: " + title;
    cardContainer.appendChild(bookTitle);

    const bookAuthor = document.createElement("h2");
    bookAuthor.innerHTML = "Author: " +author;
    cardContainer.appendChild(bookAuthor);

    const bookPages = document.createElement("h3");
    bookPages.innerHTML = "Number Of Pages: " +pages;
    cardContainer.appendChild(bookPages);
}



refreshBtn.addEventListener('click', () => {
    bookList.innerHTML = " "
    fetchData();
  });

const fetchData = () => {
fetch("http://localhost:8080/books")
  .then((response) => response.json())
  .then((data) => {
    //console.log(data)
    data.forEach(book => {
      //  console.log(book)
        createCard(book.title, book.author, book.pages)
    });
  })
  .catch((error) => {
    console.log(error);
  });
}
  