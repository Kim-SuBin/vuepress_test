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
    "revision": "1da806d5f35456708e568b78ef26305d"
  },
  {
    "url": "about/index.html",
    "revision": "6605bb3c5dd8d09a6d761cfead622129"
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
    "url": "assets/js/10.85d24b7c.js",
    "revision": "05a530be5dc5e1acebc8a03bb645ced8"
  },
  {
    "url": "assets/js/2.67a5ca42.js",
    "revision": "2916627b3b1b24049645e46ae021953f"
  },
  {
    "url": "assets/js/3.7587ff3c.js",
    "revision": "7b802cb7de8efb54a37f790c5d864e38"
  },
  {
    "url": "assets/js/4.2220f696.js",
    "revision": "442513aacc0227ce1b4d7453cd4b843e"
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
    "url": "assets/js/8.604eddf2.js",
    "revision": "7f3fb0ecd39f8f002a54f3a5fc16b4aa"
  },
  {
    "url": "assets/js/9.7d39511c.js",
    "revision": "fc132b85d312139bd1b11e7d18778818"
  },
  {
    "url": "assets/js/app.cf54ea5b.js",
    "revision": "10cfd81b7f27f56802caa725420e7975"
  },
  {
    "url": "index.html",
    "revision": "81eba3515121ece23f41d09998809628"
  },
  {
    "url": "testpage.html",
    "revision": "26758e93f77eff5dba6b65075832bd93"
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
