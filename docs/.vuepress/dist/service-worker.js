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
    "revision": "d74412df4046b9808855d06825663d81"
  },
  {
    "url": "about/index.html",
    "revision": "ce92081812ff79be8c4bea9f9e2309f3"
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
    "url": "assets/js/10.98af97eb.js",
    "revision": "bb2cee3846a1f223fa2ec73dd512ef18"
  },
  {
    "url": "assets/js/11.63d05ddc.js",
    "revision": "65484bde8f60af2b41e8efe64dc00547"
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
    "url": "assets/js/8.13d8b1ea.js",
    "revision": "6e1396ef9db4419bfccfa39913077724"
  },
  {
    "url": "assets/js/9.488d53d3.js",
    "revision": "5cae56cde7bcbb817f48b135eda7f601"
  },
  {
    "url": "assets/js/app.bf11c3eb.js",
    "revision": "7f5b0ebb8cae4d443b697490ceca36b8"
  },
  {
    "url": "index.html",
    "revision": "e11544b74626ec99ff3f39f1fddb5505"
  },
  {
    "url": "TESTPAGE.html",
    "revision": "5ba09bbc0a5f5a56b7ad069b2b7e560e"
  },
  {
    "url": "TESTPAGE2.html",
    "revision": "20ceacaf646e4136212e00f985864866"
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
