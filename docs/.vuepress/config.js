const sidebar = require('./auto-sidebar-generator');

module.exports = {
    title: 'Python Mentoring',
    description: 'HUFS RC SW 멘토링 프로그램에 멘토로 참여하며 진행한 python 수업 자료',
    themeConfig: {
        nav: [
            { text: 'Home', link: '/' },
            { text: 'About', link: '/about/' }
        ],
        sidebar: [
            '',   //top level README.md
            '/foo-nav',
            sidebar.getSidebarGroup('/tester/', 'Tester', true)
        ]
    }
}