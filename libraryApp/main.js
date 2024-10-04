const config = {
    url: "https://openlibrary.org/api/books?jscmd=data&format=json&bibkeys=ISBN:",
    cardId: "book-card",
    bookSearchInput: "book-search-input",
    bookSearchBtn: "book-search-btn",
}

let searchBtn = document.getElementById(config.bookSearchBtn);
searchBtn.addEventListener("click", function(){
    let bookCard = document.getElementById(config.cardId);
    let isbn = document.getElementById(config.bookSearchInput).value;

    fetch(config.url + isbn).then(res=>res.json().then(data=>{
        if(Object.keys(data).length === 0 && data.constructor === Object) bookCard.innerHTML = "<h1>Not Found</h1>";
        else{
            for(let bookKey in data){
                let currentBook = data[bookKey];
                generateCard(currentBook);
            }
        }
    }))
})


function generateCard(book){
    let bookCard = document.getElementById(config.cardId);
    bookCard.innerHTML = `
        <div class="card mb-3">
            <div class="card-body" style="max-width: 1000px;">
                <div class="row mb-3">
                    <div class="col-md-4">
                        <img src="${book.cover.medium}" class="card-img p-3" alt="">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title m-0 font-weight-bold">${book.title}</h5>
                            <p class="m-0"> </p>
                            <p class="card-text pt-2 book-description">${book.by_statement}</p>
                        </div>
                    </div>
                </div>

                <div class="col-10">
                    <table class="table table-striped">
                        <tbody>
                            <tr>
                              <th scope="row">Page</th>
                              <td>${book.number_of_pages}</td>
                            </tr>
                            <tr>
                              <th scope="row">Publisher</th>
                              <td>${getParseData(book.authors)}</td>
                            </tr>
                            <tr>
                              <th scope="row">Published Date</th>
                              <td colspan="2">${book.publish_date}</td>
                            </tr>
                            <tr>
                                <th scope="row">Categories</th>
                                <td colspan="2">${getParseData(book.subjects)}</td>
                            </tr>
                        </tbody>

                    </table>
                </div>
                                
            </div>
        </div>`;
}

function getParseData(data){
    let parsed = "";
    for(let i=0; i<data.length - 1; i++){
        parsed += (data[i].name + ",");
        console.log(data[i])
    };
    return parsed+ data[data.length-1].name;
}