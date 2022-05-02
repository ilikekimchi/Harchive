window.addEventListener('scroll', () => {
    let height = document.querySelector('#header-wrap').scrollHeight;
    let getYY = window.scrollY;
    let btn = document.getElementById('return-to-top');

    if (height < getYY) {
        btn.style.display = "block";
    } else {
        btn.style.display = "none";
    }
})

