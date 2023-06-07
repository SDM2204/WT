var feet=document.getElementById('feet');
var inch=document.getElementById('inch');
feet.addEventListener('input',function(){
    let f=this.value;
    let i=f*12;
    inch.value=i;
});  
inch.addEventListener('input',function(){
    let i=this.value;
    let f=i/12;
    if(!Number.isInteger(f)){
        f=f.toFixed(2);
    };
    feet.value=f;
});  
const sr=ScrollReveal({
    distance: '65px',
    duration: 2500,
    delay: 450,
    reset: true,
});
sr.reveal('h1#heading',{delay:100,origin:'top'});
sr.reveal('label',{delay:100,origin:'top'});
sr.reveal('h1',{delay:100,origin:'top'});
sr.reveal('.inpt',{delay:100,origin:'top'});