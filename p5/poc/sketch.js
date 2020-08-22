function setup() {
    createCanvas(600, 400);
    background(125);
}
  
function draw() {
    //background(125);
    stroke(150,150,150);
    fill(0,255,0,150);
    ellipse(mouseX,mouseY,50,25);
}

function keyReleased(){
    if(key == ' ')
        background(125);
}