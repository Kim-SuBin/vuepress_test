module.exports = {
    title: 'Python Mentoring',
    description: 'HUFS RC SW Mentoring Program 강의 자료',
    head: [
        ['link', { rel: 'icon', href: '/images/logo-144.png' }],
        ['link', { rel: 'manifest', href: '/manifest.json' }]
    ],
    plugins: [
        '@vuepress/back-to-top',
        ['@vuepress/pwa', {
            serviceWorker: true,
            updatePopup: true
        }]
    ],
    themeConfig: {
        displayAllHeaders: false,
        lastUpdated: 'Last Updated',
        nav: [
            { text: 'Home', link: '/' },
            { text: 'About', link: '/about/' }
        ],
        sidebar: [
            'section1'
        ]
    }
}