// const sidebar = require('./auto-sidebar-generator');
module.exports = {
    title: 'Python Mentoring',
    description: 'Python Mentoring 수업 자료',
    plugins: [
        '@vuepress/back-to-top',
        ['@vuepress/pwa', {
          serviceWorker: true,
          updatePopup: true
        }]
      ],
    themeConfig: {
        nav: [
            { text: 'Home', link: '/' },
            { text: 'About', link: '/about/' }
        ],
        sidebar: [
            { title: "Home", children: [""]},
        ],
        smoothScroll: true,
        lastUpdated: 'Last Updated'
    }
}