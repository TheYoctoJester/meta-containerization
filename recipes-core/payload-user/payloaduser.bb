SUMMARY = "recipe to add an user to the payload container"
LICENSE = "MIT"

EXCLUDE_FROM_WORLD = "1"

inherit useradd

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.
PAYLOAD_USER ?= "user"
PAYLOAD_UID ?= "1000"
PAYLOAD_GROUP ?= "group"
PAYLOAD_GID ?= "1000"

USERADD_PARAM:${PN} = "-u ${PAYLOAD_UID} -M ${PAYLOAD_USER}"
GROUPADD_PARAM:${PN} = "-g ${PAYLOAD_GID} ${PAYLOAD_GROUP}"

FILES:${PN} = "dummy"

do_install () {
	touch ${D}/dummy
}

