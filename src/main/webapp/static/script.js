const input = document.querySelector("[name='clubName']");
const error = document.querySelector(".front-error");

input.addEventListener("keydown", () => {
    console.log(input.value.length);
    if(input.value.length < 4) {
        error.classList.remove("disabled");
        return;
    }else {
        error.classList.add("disabled");
    }
})

console.log(input);