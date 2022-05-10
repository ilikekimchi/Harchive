function postInfo() {
	let postid = event.target.dataset.id;
	const xhr = new XMLHttpRequest();
    xhr.open('GET', 'post/view?postid='+postid);
    xhr.send(); 
	
    document.querySelector('.post-detail').classList.remove('hidden');
}

function modalClose() {
    document.querySelector('.post-detail').classList.add('hidden');
}