// Активация текущей страницы в навигации
document.addEventListener('DOMContentLoaded', function() {
    const currentPage = location.pathname.split('/').pop();
    const navLinks = document.querySelectorAll('nav a');
    
    navLinks.forEach(link => {
        if (link.getAttribute('href') === currentPage) {
            link.classList.add('active');
        }
    });
    
    // Мобильное меню (добавьте кнопку меню в HTML для маленьких экранов)
    const menuBtn = document.createElement('button');
    menuBtn.innerHTML = '☰ Меню';
    menuBtn.classList.add('menu-toggle');
    document.querySelector('nav').prepend(menuBtn);
    
    menuBtn.addEventListener('click', function() {
        document.querySelector('nav ul').classList.toggle('show');
    });
});