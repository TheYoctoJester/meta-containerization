SUMMARY = "A small container just packing up the PAYLOAD and a user account"

IMAGE_INSTALL = "base-passwd payloaduser ${PAYLOAD}"
IMAGE_LINGUAS = ""

LICENSE = "MIT"

inherit image
inherit image-container
