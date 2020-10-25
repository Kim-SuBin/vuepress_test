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
    "revision": "6f51109596bdb21b6c5c3f91e1f8cd5b"
  },
  {
    "url": "about/index.html",
    "revision": "51ae615d4bddcebf0058693cef7b20de"
  },
  {
    "url": "assets/css/0.styles.1302df3f.css",
    "revision": "92ff9f8f9f0d9a224ffe544a0a9a9d28"
  },
  {
    "url": "assets/img/search.83621669.svg",
    "revision": "83621669651b9a3d4bf64d1a670ad856"
  },
  {
    "url": "assets/js/10.7398c6e2.js",
    "revision": "12faca5bd7f2a113a7cda48ac44fffe7"
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
    "url": "assets/js/5.76deedc4.js",
    "revision": "9b093c330f9dc6de562663bce263460e"
  },
  {
    "url": "assets/js/6.ce200b77.js",
    "revision": "002bbc5994658e9a2ceba19dc45af66e"
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
    "url": "assets/js/9.488d53d3.js",
    "revision": "5cae56cde7bcbb817f48b135eda7f601"
  },
  {
    "url": "assets/js/app.0256f1c5.js",
    "revision": "f911cba7e4bf25291eaf9fb6172ffa47"
  },
  {
    "url": "index.html",
    "revision": "4a2c4e9b49491182df3140316482b040"
  },
  {
    "url": "TESTPAGE.html",
    "revision": "d7fd6e2a87f3796eab8834ae7f56492c"
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
