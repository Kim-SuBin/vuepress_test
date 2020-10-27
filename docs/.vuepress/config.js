module.exports = {
    title: 'Python Mentoring',
    description: 'HUFS RC SW Mentoring Program 강의 자료',
    email: '2504sb@gmail.com',
    base: 'python_mentoring',
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
        nav: [
            { text: 'Github', link: 'https://github.com/Kim-SuBin/python_mentoring' },
            { text: 'Blog', link: 'https://subin-0320.tistory.com/' }
        ],
        sidebar: [
            {
                title: 'Section1',
                children: [
                    '/section1/test1',
                    '/section1/test2'
                ]
            }
        ],
        smoothScroll: true,
        lastUpdated: 'Last Updated',
    }
}