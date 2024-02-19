import Team from "./Team"


const TeamContainer = () => {
  return (
    <div  className={`bg-silver-950 px-4 py-5 rounded-3xl max-w-md`}>
      <section>
        <h2 className={`text-center text-2xl font-bauhs text-primary-500`}>EQUIPOS</h2>
      </section>
      <section>
        <Team/>
      </section>
    </div>
  )
}
export default TeamContainer