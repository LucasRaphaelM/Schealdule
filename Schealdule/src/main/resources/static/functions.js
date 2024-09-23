const indexBtn = document.getElementById('index');
const basicBtn = document.getElementById('basico');
const intermedBtn = document.getElementById('intermediario');
const advancedBtn = document.getElementById('avancado');


function mudavideo1(){
    document.getElementById("videopt").style.display="block";
    document.getElementById("videoen").style.display="none";
};

function mudavideo2(){
    document.getElementById("videopt").style.display="none";
    document.getElementById("videoen").style.display="block";
};

indexBtn.addEventListener('click', 

    (event)=>
        {
            event.preventDefault();
            window.location.href = '/login';
        }
);

basicBtn.addEventListener('click',
    (event)=>
        {
                event.preventDefault();
                window.location.href = '/login';
        }
);

intermedBtn.addEventListener('click',
    (event)=>
        {
                event.preventDefault();
                window.location.href = '/login';
        }
);

advancedBtn.addEventListener('click',
    (event)=>
        {
            event.preventDefault();
            window.location.href = '/login'
        }
);
