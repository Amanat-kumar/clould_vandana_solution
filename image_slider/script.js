/**5. DOM Manipulation - Image Slider
Create an image slider using JavaScript that:
 Displays one image at a time.
 Has Next and Previous buttons to navigate through images.
 Uses an array of image URLs.
*/
const images = [
    "pexels-834935256-20703958.jpg",
    "pexels-christiano-sinisterra-3279598-29193172.jpg",
    "pexels-drkesu-12045314.jpg"
];

let currentIndex = 0;
const slider = document.getElementById("slider");

function updateImage() {
    slider.style.opacity = "0";
    setTimeout(() => {
        slider.src = images[currentIndex];
        slider.style.opacity = "1"; 
    }, 200);
}

updateImage();

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
}