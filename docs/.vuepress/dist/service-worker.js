/**
 * Welcome to your Workbox-powered service worker!
 *
 * You'll need to register this file in your web app and you should
 * disable HTTP caching for this file too.
 * See https://goo.gl/nhQhGp
 *
 * The rest of the code is auto-generated. Please don't update this file
 * directly; instead, make changes to your Workbox build configuration
 * and re-run your build process.
 * See https://goo.gl/2aRDsh
 */

importScripts("https://storage.googleapis.com/workbox-cdn/releases/3.6.3/workbox-sw.js");

/**
 * The workboxSW.precacheAndRoute() method efficiently caches and responds to
 * requests for URLs in the manifest.
 * See https://goo.gl/S9QRab
 */
self.__precacheManifest = [
  {
    "url": "404.html",
    "revision": "1524a76ff5f676ba0fb44c9a3d00870d"
  },
  {
    "url": "about/index.html",
    "revision": "61df7a69b31184a947bc2594cf4ca253"
  },
  {
    "url": "assets/css/0.styles.92d765fa.css",
    "revision": "4061a3e511afb103566088b3e72d951f"
  },
  {
    "url": "assets/img/search.83621669.svg",
    "revision": "83621669651b9a3d4bf64d1a670ad856"
  },
  {
    "url": "assets/js/10.371f7e1f.js",
    "revision": "b196e11c0f05eb0533c368a52173d880"
  },
  {
    "url": "assets/js/11.f8268cea.js",
    "revision": "21100745a8950ed30cb734267f392c2a"
  },
  {
    "url": "assets/js/2.67a5ca42.js",
    "revision": "2916627b3b1b24049645e46ae021953f"
  },
  {
    "url": "assets/js/3.c625618d.js",
    "revision": "6596fd4a47244a6254552b1d49095903"
  },
  {
    "url": "assets/js/4.0e911860.js",
    "revision": "adbda543dd1693b7ca8fa839989289bc"
  },
  {
    "url": "assets/js/5.e5f39d73.js",
    "revision": "2d7d57e4e0d61a4a8633ad35ad5df6ad"
  },
  {
    "url": "assets/js/6.7915fda0.js",
    "revision": "1ea15446bbbf614fe1fcf69cd8daaeac"
  },
  {
    "url": "assets/js/7.47d05278.js",
    "revision": "813570e04304b4e6d9c3da0494d9c8d2"
  },
  {
    "url": "assets/js/8.564a08a2.js",
    "revision": "c2cc68b6ccaa4f9c2fba11cfc1c6241e"
  },
  {
    "url": "assets/js/9.2d11164c.js",
    "revision": "1ce669344f84ddef0f5c6954e09e8af6"
  },
  {
    "url": "assets/js/app.2877ff2f.js",
    "revision": "8e82d3ac721d1b501db958b3e21687d5"
  },
  {
    "url": "index.html",
    "revision": "5ffbe8592d54eb32726609e043608aad"
  },
  {
    "url": "TESTPAGE.html",
    "revision": "b281db8c6451c0328c586c4af79580f6"
  },
  {
    "url": "TESTPAGE2.html",
    "revision": "db1e592ab4638770ccd876bbdd58c7c4"
  }
].concat(self.__precacheManifest || []);
workbox.precaching.suppressWarnings();
workbox.precaching.precacheAndRoute(self.__precacheManifest, {});
addEventListener('message', event => {
  const replyPort = event.ports[0]
  const message = event.data
  if (replyPort && message && message.type === 'skip-waiting') {
    event.waitUntil(
      self.skipWaiting().then(
        () => replyPort.postMessage({ error: null }),
        error => replyPort.postMessage({ error })
      )
    )
  }
})
